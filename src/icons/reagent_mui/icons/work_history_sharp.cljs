(ns reagent-mui.icons.work-history-sharp
  "Imports @mui/icons-material/WorkHistorySharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def work-history-sharp (create-svg-icon [(e "path" #js {"d" "M16.66 11.13c2-.37 3.88.11 5.34 1.13V6h-6V2H8v4H2v15h9.68c-.63-1.33-.87-2.88-.52-4.51.59-2.7 2.78-4.86 5.5-5.36zM10 4h4v2h-4V4z"}) (e "path" #js {"d" "M18 13c-2.76 0-5 2.24-5 5s2.24 5 5 5 5-2.24 5-5-2.24-5-5-5zm1.65 7.35L17.5 18.2V15h1v2.79l1.85 1.85-.7.71z"})]
                                         "WorkHistorySharp"))
