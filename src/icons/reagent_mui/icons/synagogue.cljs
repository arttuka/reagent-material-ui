(ns reagent-mui.icons.synagogue
  "Imports @mui/icons-material/Synagogue as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def synagogue (create-svg-icon (e "path" #js {"d" "M6 8v13h4v-5c0-1.1.9-2 2-2s2 .9 2 2v5h4V8l-6-5-6 5zm7.5 2c0 .83-.67 1.5-1.5 1.5s-1.5-.67-1.5-1.5.67-1.5 1.5-1.5 1.5.67 1.5 1.5zM3 5c-1.1 0-2 .9-2 2v1h4V7c0-1.1-.9-2-2-2zM1 9h4v12H1zm20-4c-1.1 0-2 .9-2 2v1h4V7c0-1.1-.9-2-2-2zm-2 4h4v12h-4z"})
                                "Synagogue"))
