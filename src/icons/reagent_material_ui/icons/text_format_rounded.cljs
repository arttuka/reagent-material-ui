(ns reagent-material-ui.icons.text-format-rounded
  "Imports @material-ui/icons/TextFormatRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def text-format-rounded (create-svg-icon (e "path" #js {"d" "M5 18c0 .55.45 1 1 1h12c.55 0 1-.45 1-1s-.45-1-1-1H6c-.55 0-1 .45-1 1zm4.5-5.2h5l.66 1.6c.15.36.5.6.89.6.69 0 1.15-.71.88-1.34l-3.88-8.97C12.87 4.27 12.46 4 12 4c-.46 0-.87.27-1.05.69l-3.88 8.97c-.27.63.2 1.34.89 1.34.39 0 .74-.24.89-.6l.65-1.6zM12 5.98 13.87 11h-3.74L12 5.98z"})
                                          "TextFormatRounded"))
