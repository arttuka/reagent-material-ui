(ns reagent-material-ui.icons.military-tech-outlined
  "Imports @material-ui/icons/MilitaryTechOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def military-tech-outlined (create-svg-icon (e "path" #js {"d" "M17 10.43V2H7v8.43c0 .35.18.68.49.86l4.18 2.51-.99 2.34-3.41.29 2.59 2.24L9.07 22 12 20.23 14.93 22l-.78-3.33 2.59-2.24-3.41-.29-.99-2.34 4.18-2.51c.3-.18.48-.5.48-.86zm-6 .64l-2-1.2V4h2v7.07zm4-1.2l-2 1.2V4h2v5.87z"})
                                             "MilitaryTechOutlined"))
