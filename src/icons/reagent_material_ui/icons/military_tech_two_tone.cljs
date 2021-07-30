(ns reagent-material-ui.icons.military-tech-two-tone
  "Imports @material-ui/icons/MilitaryTechTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def military-tech-two-tone (create-svg-icon [(e "path" #js {"d" "m13 11.07 2-1.2V4h-2zM9 4v5.87l2 1.2V4z", "opacity" ".3"}) (e "path" #js {"d" "M17 10.43V2H7v8.43c0 .35.18.68.49.86l4.18 2.51-.99 2.34-3.41.29 2.59 2.24L9.07 22 12 20.23 14.93 22l-.78-3.33 2.59-2.24-3.41-.29-.99-2.34 4.18-2.51c.3-.18.48-.5.48-.86zm-6 .64-2-1.2V4h2v7.07zm4-1.2-2 1.2V4h2v5.87z"})]
                                             "MilitaryTechTwoTone"))
