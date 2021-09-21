(ns reagent-mui.icons.snippet-folder-sharp
  "Imports @mui/icons-material/SnippetFolderSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def snippet-folder-sharp (create-svg-icon (e "path" #js {"d" "m12 6-2-2H2v16h20V6H12zm7 11h-6V9h3.5l2.5 2.5V17zm-3.12-6.5 1.62 1.62v3.38h-3v-5h1.38z"})
                                           "SnippetFolderSharp"))
