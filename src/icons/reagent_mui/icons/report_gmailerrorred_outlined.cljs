(ns reagent-mui.icons.report-gmailerrorred-outlined
  "Imports @mui/icons-material/ReportGmailerrorredOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def report-gmailerrorred-outlined (create-svg-icon [(e "path" #js {"d" "M15.73 3H8.27L3 8.27v7.46L8.27 21h7.46L21 15.73V8.27L15.73 3zM19 14.9 14.9 19H9.1L5 14.9V9.1L9.1 5h5.8L19 9.1v5.8z"}) (e "circle" #js {"cx" "12", "cy" "16", "r" "1"}) (e "path" #js {"d" "M11 7h2v7h-2z"})]
                                                    "ReportGmailerrorredOutlined"))
