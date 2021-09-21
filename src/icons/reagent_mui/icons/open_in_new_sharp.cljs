(ns reagent-mui.icons.open-in-new-sharp
  "Imports @mui/icons-material/OpenInNewSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def open-in-new-sharp (create-svg-icon (e "path" #js {"d" "M19 19H5V5h7V3H3v18h18v-9h-2v7zM14 3v2h3.59l-9.83 9.83 1.41 1.41L19 6.41V10h2V3h-7z"})
                                        "OpenInNewSharp"))
