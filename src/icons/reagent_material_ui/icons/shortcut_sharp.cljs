(ns reagent-material-ui.icons.shortcut-sharp
  "Imports @material-ui/icons/ShortcutSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def shortcut-sharp (create-svg-icon (e "path" #js {"d" "M21 11l-6-6v5H8c-2.76 0-5 2.24-5 5v4h2v-4c0-1.65 1.35-3 3-3h7v5l6-6z"})
                                     "ShortcutSharp"))
