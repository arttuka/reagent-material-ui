(ns reagent-mui.icons.add-link-outlined
  "Imports @mui/icons-material/AddLinkOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def add-link-outlined (create-svg-icon (e "path" #js {"d" "M8 11h8v2H8v-2zm12.1 1H22c0-2.76-2.24-5-5-5h-4v1.9h4c1.71 0 3.1 1.39 3.1 3.1zM3.9 12c0-1.71 1.39-3.1 3.1-3.1h4V7H7c-2.76 0-5 2.24-5 5s2.24 5 5 5h4v-1.9H7c-1.71 0-3.1-1.39-3.1-3.1zM19 12h-2v3h-3v2h3v3h2v-3h3v-2h-3v-3z"})
                                        "AddLinkOutlined"))
