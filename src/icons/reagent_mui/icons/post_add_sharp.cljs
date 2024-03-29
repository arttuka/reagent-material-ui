(ns reagent-mui.icons.post-add-sharp
  "Imports @mui/icons-material/PostAddSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def post-add-sharp (create-svg-icon [(e "path" #js {"d" "M17 19.22H5V7h7V5H3v16h16v-9h-2z"}) (e "path" #js {"d" "M19 2h-2v3h-3c.01.01 0 2 0 2h3v2.99c.01.01 2 0 2 0V7h3V5h-3V2zM7 9h8v2H7zm0 3v2h8v-2h-3zm0 3h8v2H7z"})]
                                     "PostAddSharp"))
