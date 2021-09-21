(ns reagent-mui.icons.snippet-folder
  "Imports @mui/icons-material/SnippetFolder as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def snippet-folder (create-svg-icon (e "path" #js {"d" "m15.88 10.5 1.62 1.62v3.38h-3v-5h1.38zM22 8v10c0 1.1-.9 2-2 2H4c-1.1 0-2-.9-2-2l.01-12c0-1.1.89-2 1.99-2h6l2 2h8c1.1 0 2 .9 2 2zm-3 3.5L16.5 9H13v8h6v-5.5z"})
                                     "SnippetFolder"))
