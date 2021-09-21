(ns reagent-mui.icons.file-present-sharp
  "Imports @mui/icons-material/FilePresentSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def file-present-sharp (create-svg-icon (e "path" #js {"d" "M14 2H4v20h16V8l-6-6zm2 13c0 2.21-1.79 4-4 4s-4-1.79-4-4V9.5C8 8.12 9.12 7 10.5 7S13 8.12 13 9.5V15h-2V9.5c0-.28-.22-.5-.5-.5s-.5.22-.5.5V15c0 1.1.9 2 2 2s2-.9 2-2v-4h2v4zm-2-7V4l4 4h-4z"})
                                         "FilePresentSharp"))
