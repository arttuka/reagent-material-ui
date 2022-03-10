(ns reagent-mui.icons.volcano
  "Imports @mui/icons-material/Volcano as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def volcano (create-svg-icon (e "path" #js {"d" "M18 8h-7l-2 5H6l-4 9h20zm-5-7h2v4h-2zm3.1212 4.4683L18.9496 2.64l1.4142 1.4142-2.8284 2.8284zm-8.4815-1.418 1.4142-1.4142 2.8284 2.8284-1.4142 1.4142z"})
                              "Volcano"))
