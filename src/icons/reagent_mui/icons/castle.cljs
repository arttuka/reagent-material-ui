(ns reagent-mui.icons.castle
  "Imports @mui/icons-material/Castle as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def castle (create-svg-icon (e "path" #js {"d" "M21 9v2h-2V3h-2v2h-2V3h-2v2h-2V3H9v2H7V3H5v8H3V9H1v12h9v-3c0-1.1.9-2 2-2s2 .9 2 2v3h9V9h-2zm-10 3H9V9h2v3zm4 0h-2V9h2v3z"})
                             "Castle"))
