(ns reagent-material-ui.icons.switch-right-two-tone
  "Imports @material-ui/icons/SwitchRightTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def switch-right-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15.5 15.38V8.62L18.88 12l-3.38 3.38", "opacity" ".3"}) (e "path" #js {"d" "M15.5 15.38V8.62L18.88 12l-3.38 3.38M14 19l7-7-7-7v14zm-4 0V5l-7 7 7 7z"}))
                                            "SwitchRightTwoTone"))
