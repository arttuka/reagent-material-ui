(ns reagent-mui.icons.last-page
  "Imports @mui/icons-material/LastPage as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def last-page (create-svg-icon (e "path" #js {"d" "M5.59 7.41 10.18 12l-4.59 4.59L7 18l6-6-6-6zM16 6h2v12h-2z"})
                                "LastPage"))
