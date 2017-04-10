/*
Copyright(c) 2016 kobaken0029 All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package click.kobaken.rxirohaandroid.qr;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.LayoutRes;

import click.kobaken.rxirohaandroid.qr.view.QRReaderActivity;

public class QRReaderBuilder {
    private Context context;
    private ReadQRCallback callback;

    @LayoutRes
    private int layoutId;

    public QRReaderBuilder(Context context) {
        this.context = context;
    }

    public QRReaderBuilder setCallback(ReadQRCallback callback) {
        this.callback = callback;
        return this;
    }

    public QRReaderBuilder setLayoutId(@LayoutRes int layoutId) {
        this.layoutId = layoutId;
        return this;
    }

    public Intent build() {
        if (context == null || callback == null) {
            throw new NullPointerException();
        }

        QRReaderActivity.setCallback(callback);
        return QRReaderActivity.getCallingIntent(context, layoutId);
    }
}