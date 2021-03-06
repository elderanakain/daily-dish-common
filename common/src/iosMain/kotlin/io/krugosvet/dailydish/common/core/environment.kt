package io.krugosvet.dailydish.common.core

import io.krugosvet.dailydish.common.core.Environment.DEV
import io.krugosvet.dailydish.common.core.Environment.PROD

internal actual val environment: Environment =
    when {
        Platform.isDebugBinary -> DEV
        else -> PROD
    }