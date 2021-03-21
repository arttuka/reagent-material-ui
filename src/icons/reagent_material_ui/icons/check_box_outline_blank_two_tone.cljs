(ns reagent-material-ui.icons.check-box-outline-blank-two-tone
  "Imports @material-ui/icons/CheckBoxOutlineBlankTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def check-box-outline-blank-two-tone (create-svg-icon (e "path" #js {"d" "M19 5v14H5V5h14m0-2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2z"})
                                                       "CheckBoxOutlineBlankTwoTone"))
