(ns reagent-material-ui.icons.text-snippet-sharp
  "Imports @material-ui/icons/TextSnippetSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def text-snippet-sharp (create-svg-icon (e "path" #js {"d" "M21 9l-6-6H3v18h18V9zM7 7h7v2H7V7zm10 10H7v-2h10v2zm0-4H7v-2h10v2z"})
                                         "TextSnippetSharp"))
