(ns reagent-material-ui.icons.perm-data-setting-rounded
  "Imports @material-ui/icons/PermDataSettingRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def perm-data-setting-rounded (create-svg-icon (e "path" #js {"d" "M15.98 11.3c1.42-.42 2.78-.37 4.01 0V2.42c0-.89-1.08-1.34-1.71-.71L1.71 18.29c-.63.63-.19 1.71.7 1.71h8.88c-.36-1.22-.42-2.57-.01-3.98.65-2.25 2.45-4.06 4.7-4.72zm5.77 6.7c0-.22-.03-.42-.06-.63l.84-.73c.18-.16.22-.42.1-.63l-.59-1.02c-.12-.21-.37-.3-.59-.22l-1.06.36c-.32-.27-.68-.48-1.08-.63l-.22-1.09c-.05-.23-.25-.4-.49-.4h-1.18c-.24 0-.44.17-.49.4l-.22 1.09c-.4.15-.76.36-1.08.63l-1.06-.36c-.23-.08-.47.02-.59.22l-.59 1.02c-.12.21-.08.47.1.63l.84.73c-.03.21-.06.41-.06.63s.03.42.06.63l-.84.73c-.18.16-.22.42-.1.63l.59 1.02c.12.21.37.3.59.22l1.06-.36c.32.27.68.48 1.08.63l.22 1.09c.05.23.25.4.49.4h1.18c.24 0 .44-.17.49-.4l.22-1.09c.4-.15.76-.36 1.08-.63l1.06.36c.23.08.47-.02.59-.22l.59-1.02c.12-.21.08-.47-.1-.63l-.84-.73c.03-.21.06-.41.06-.63zM18 20c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2z"})
                                                "PermDataSettingRounded"))
