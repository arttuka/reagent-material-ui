(ns reagent-material-ui.icons.format-shapes-two-tone
  "Imports @material-ui/icons/FormatShapesTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-shapes-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M3 3h2v2H3zm16 16h2v2h-2zm0-16h2v2h-2zM3 19h2v2H3z", "opacity" ".3"}) (e "path" #js {"d" "M11.29 7l-3.4 9h1.62l.73-2h3.49l.74 2h1.63l-3.41-9h-1.4zm-.6 5.74L12 8.91l1.3 3.83h-2.61zM17 3H7V1H1v6h2v10H1v6h6v-2h10v2h6v-6h-2V7h2V1h-6v2zM3 3h2v2H3V3zm2 18H3v-2h2v2zm16 0h-2v-2h2v2zM19 3h2v2h-2V3zm0 14h-2v2H7v-2H5V7h2V5h10v2h2v10z"}))
                                             "FormatShapesTwoTone"))
