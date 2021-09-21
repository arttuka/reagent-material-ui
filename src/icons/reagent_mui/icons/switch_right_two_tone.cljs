(ns reagent-mui.icons.switch-right-two-tone
  "Imports @mui/icons-material/SwitchRightTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def switch-right-two-tone (create-svg-icon [(e "path" #js {"d" "M15.5 15.38V8.62L18.88 12l-3.38 3.38", "opacity" ".3"}) (e "path" #js {"d" "M15.5 15.38V8.62L18.88 12l-3.38 3.38M14 19l7-7-7-7v14zm-4 0V5l-7 7 7 7z"})]
                                            "SwitchRightTwoTone"))
