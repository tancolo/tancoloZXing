/*
 * Copyright (C) 2010 ZXing authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.zxing.client.android.camera;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

final class PreviewCallback implements Camera.PreviewCallback {

  private static final String TAG = PreviewCallback.class.getSimpleName();

  private final CameraConfigurationManager configManager;
  private Handler previewHandler;
  private int previewMessage;

  PreviewCallback(CameraConfigurationManager configManager) {
    this.configManager = configManager;
  }

  void setHandler(Handler previewHandler, int previewMessage) {
    this.previewHandler = previewHandler;
    this.previewMessage = previewMessage;
  }

  @Override
  public void onPreviewFrame(byte[] data, Camera camera) {
//    Log.e(TAG, "\n\n onPreviewFrame ");
//    Log.e(TAG, Log.getStackTraceString(new Throwable()));

    Point cameraResolution = configManager.getCameraResolution();
    Handler thePreviewHandler = previewHandler;
    if (cameraResolution != null && thePreviewHandler != null) {
        //add by tancolo
      Point screenResolution = configManager.getScreenResolution();
      Message message;
      if (screenResolution.x < screenResolution.y){
        // portrait
        message = thePreviewHandler.obtainMessage(previewMessage, cameraResolution.y,
                cameraResolution.x, data);
      } else {
        // landscape
        message = thePreviewHandler.obtainMessage(previewMessage, cameraResolution.x,
                cameraResolution.y, data);
      }
//      Message message = thePreviewHandler.obtainMessage(previewMessage, cameraResolution.x,
//          cameraResolution.y, data);
        //end add

      message.sendToTarget();
      previewHandler = null;
    } else {
      Log.d(TAG, "Got preview callback, but no handler or resolution available");
    }
  }

}
