(ns reagent-mui.icons.file-copy-sharp
  "Imports @mui/icons-material/FileCopySharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def file-copy-sharp (create-svg-icon (e "path" #js {"d" "M16 1H2v16h2V3h12V1zm-1 4 6 6v12H6V5h9zm-1 7h5.5L14 6.5V12z"})
                                      "FileCopySharp"))
