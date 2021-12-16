(ns reagent-mui.icons.fax-outlined
  "Imports @mui/icons-material/FaxOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def fax-outlined (create-svg-icon [(e "path" #js {"d" "M19 9h-1V4H8v5h-.78C6.67 8.39 5.89 8 5 8c-1.66 0-3 1.34-3 3v7c0 1.66 1.34 3 3 3 .89 0 1.67-.39 2.22-1H22v-8c0-1.66-1.34-3-3-3zM6 18c0 .55-.45 1-1 1s-1-.45-1-1v-7c0-.55.45-1 1-1s1 .45 1 1v7zm4-12h6v3h-6V6zm10 12H8v-7h11c.55 0 1 .45 1 1v6z"}) (e "circle" #js {"cx" "15", "cy" "13", "r" "1"}) (e "circle" #js {"cx" "18", "cy" "13", "r" "1"}) (e "circle" #js {"cx" "15", "cy" "16", "r" "1"}) (e "circle" #js {"cx" "18", "cy" "16", "r" "1"}) (e "path" #js {"d" "M9 12h4v5H9z"})]
                                   "FaxOutlined"))
