(ns reagent-mui.icons.document-scanner
  "Imports @mui/icons-material/DocumentScanner as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def document-scanner (create-svg-icon (e "path" #js {"d" "M7 3H4v3H2V1h5v2zm15 3V1h-5v2h3v3h2zM7 21H4v-3H2v5h5v-2zm13-3v3h-3v2h5v-5h-2zm-1 0c0 1.1-.9 2-2 2H7c-1.1 0-2-.9-2-2V6c0-1.1.9-2 2-2h10c1.1 0 2 .9 2 2v12zM15 8H9v2h6V8zm0 3H9v2h6v-2zm0 3H9v2h6v-2z"})
                                       "DocumentScanner"))
