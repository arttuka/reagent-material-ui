(ns reagent-material-ui.icons.explicit-sharp
  "Imports @material-ui/icons/ExplicitSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def explicit-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zm-6 6h-4v2h4v2h-4v2h4v2H9V7h6v2z"})
                                     "ExplicitSharp"))
