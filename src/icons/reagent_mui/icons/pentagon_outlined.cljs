(ns reagent-mui.icons.pentagon-outlined
  "Imports @mui/icons-material/PentagonOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def pentagon-outlined (create-svg-icon (e "path" #js {"d" "M19.63 9.78 16.56 19H7.44L4.37 9.78 12 4.44l7.63 5.34zM2 9l4 12h12l4-12-10-7L2 9z"})
                                        "PentagonOutlined"))
