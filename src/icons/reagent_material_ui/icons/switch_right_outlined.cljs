(ns reagent-material-ui.icons.switch-right-outlined
  "Imports @material-ui/icons/SwitchRightOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def switch-right-outlined (create-svg-icon (e "path" #js {"d" "M15.5 15.38V8.62L18.88 12l-3.38 3.38M14 19l7-7-7-7v14zm-4 0V5l-7 7 7 7z"})
                                            "SwitchRightOutlined"))
