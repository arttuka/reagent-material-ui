(ns reagent-mui.icons.text-snippet-sharp
  "Imports @mui/icons-material/TextSnippetSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def text-snippet-sharp (create-svg-icon (e "path" #js {"d" "m21 9-6-6H3v18h18V9zM7 7h7v2H7V7zm10 10H7v-2h10v2zm0-4H7v-2h10v2z"})
                                         "TextSnippetSharp"))
