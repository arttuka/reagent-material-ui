(ns reagent-mui.icons.label-important-two-tone
  "Imports @mui/icons-material/LabelImportantTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def label-important-two-tone (create-svg-icon [(e "path" #js {"d" "M15 7H7.89l3.57 5-3.57 5H15l3.55-5z", "opacity" ".3"}) (e "path" #js {"d" "M16.63 5.84C16.27 5.33 15.67 5 15 5H4l5 7-5 6.99h11c.67 0 1.27-.32 1.63-.83L21 12l-4.37-6.16zM15 17H7.89l3.57-5-3.57-5H15l3.55 5L15 17z"})]
                                               "LabelImportantTwoTone"))
