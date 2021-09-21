(ns reagent-mui.icons.home-work-outlined
  "Imports @mui/icons-material/HomeWorkOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def home-work-outlined (create-svg-icon [(e "path" #js {"d" "M17 15h2v2h-2zm0-4h2v2h-2zm0-4h2v2h-2zm-3.26 0 1.26.84V7z"}) (e "path" #js {"d" "M10 3v1.51l2 1.33V5h9v14h-4v2h6V3z"}) (e "path" #js {"d" "M8.17 5.7 15 10.25V21H1V10.48L8.17 5.7zM10 19h3v-7.84L8.17 8.09 3 11.38V19h3v-6h4v6z"})]
                                         "HomeWorkOutlined"))
