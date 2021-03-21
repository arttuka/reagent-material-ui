(ns reagent-material-ui.icons.eight-k-sharp
  "Imports @material-ui/icons/EightKSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def eight-k-sharp (create-svg-icon (e "path" #js {"d" "M8 12.5h1.5V14H8v-1.5zM8 10h1.5v1.5H8V10zm13-7H3v18h18V3zm-10 7v4c0 .55-.45 1-1 1H7.5c-.55 0-1-.45-1-1v-4c0-.55.45-1 1-1H10c.55 0 1 .45 1 1zm7 5h-1.75l-1.75-2.25V15H13V9h1.5v2.25L16.25 9H18l-2.25 3L18 15z"})
                                    "EightKSharp"))
