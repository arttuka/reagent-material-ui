(ns reagent-material-ui.icons.text-format-rounded
  "Imports @material-ui/icons/TextFormatRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def text-format-rounded (create-svg-icon (e "path" #js {"d" "M9.79 12.19h4.44l.77 2.22c.12.35.46.59.83.59h.01c.61 0 1.04-.61.82-1.19l-3.34-8.89C13.12 4.37 12.59 4 12 4c-.59 0-1.12.37-1.33.92l-3.34 8.89c-.22.58.21 1.19.82 1.19h.01c.37 0 .7-.23.83-.59l.8-2.22zm2.16-6.15h.09l1.6 4.55h-3.29l1.6-4.55zM18 19H6c-.55 0-1-.45-1-1s.45-1 1-1h12c.55 0 1 .45 1 1s-.45 1-1 1z"})
                                          "TextFormatRounded"))
