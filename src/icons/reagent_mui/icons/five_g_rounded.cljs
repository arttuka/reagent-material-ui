(ns reagent-mui.icons.five-g-rounded
  "Imports @mui/icons-material/FiveGRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def five-g-rounded (create-svg-icon (e "path" #js {"d" "M18 13h1v2h-5V9h6c.55 0 1-.45 1-1s-.45-1-1-1h-6c-1.1 0-2 .9-2 2v6c0 1.1.9 2 2 2h5c1.1 0 2-.9 2-2v-3c0-.55-.45-1-1-1h-2c-.55 0-1 .45-1 1s.45 1 1 1zM4 13h4v2H4c-.55 0-1 .45-1 1s.45 1 1 1h4c1.1 0 2-.9 2-2v-2c0-1.1-.9-2-2-2H5V9h4c.55 0 1-.45 1-1s-.45-1-1-1H4c-.55 0-1 .45-1 1v4c0 .55.45 1 1 1z"})
                                     "FiveGRounded"))
