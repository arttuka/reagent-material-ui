(ns reagent-mui.icons.bedroom-child-two-tone
  "Imports @mui/icons-material/BedroomChildTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def bedroom-child-two-tone (create-svg-icon [(e "path" #js {"d" "M4 20h16V4H4v16zm2-7.13c0-1 .62-1.85 1.5-2.2V9c0-1.1.9-2 2-2h5c1.1 0 2 .9 2 2v1.67c.88.35 1.5 1.2 1.5 2.2V17h-1.5v-1.5h-9V17H6v-4.13z", "opacity" ".3"}) (e "path" #js {"d" "M20 2H4c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm0 18H4V4h16v16z"}) (e "path" #js {"d" "M7.5 15.5h9V17H18v-4.13c0-1-.62-1.85-1.5-2.2V9c0-1.1-.9-2-2-2h-5c-1.1 0-2 .9-2 2v1.67c-.88.35-1.5 1.2-1.5 2.2V17h1.5v-1.5zm1.5-7h6v2H9v-2zM8.37 12h7.27c.48 0 .87.39.87.87V14h-9v-1.13H7.5c0-.48.39-.87.87-.87z"})]
                                             "BedroomChildTwoTone"))
