(ns reagent-mui.icons.contrast-outlined
  "Imports @mui/icons-material/ContrastOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def contrast-outlined (create-svg-icon (e "path" #js {"d" "M12 22c5.52 0 10-4.48 10-10S17.52 2 12 2 2 6.48 2 12s4.48 10 10 10zm1-17.93c3.94.49 7 3.85 7 7.93s-3.05 7.44-7 7.93V4.07z"})
                                        "ContrastOutlined"))
