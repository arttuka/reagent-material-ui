(ns reagent-material-ui.icons.more-rounded
  "Imports @material-ui/icons/MoreRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def more-rounded (create-svg-icon (e "path" #js {"d" "M19 5H9c-.65 0-1.25.31-1.63.84l-3.55 5c-.49.69-.49 1.62 0 2.32l3.55 5c.38.53.98.84 1.63.84h10c1.1 0 2-.9 2-2V7c0-1.1-.9-2-2-2zm-9.5 8c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zm3.5 0c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zm3.5 0c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1z"})
                                   "MoreRounded"))
