(ns reagent-material-ui.icons.toc-rounded
  "Imports @material-ui/icons/TocRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def toc-rounded (create-svg-icon (e "path" #js {"d" "M4 9h12c.55 0 1-.45 1-1s-.45-1-1-1H4c-.55 0-1 .45-1 1s.45 1 1 1zm0 4h12c.55 0 1-.45 1-1s-.45-1-1-1H4c-.55 0-1 .45-1 1s.45 1 1 1zm0 4h12c.55 0 1-.45 1-1s-.45-1-1-1H4c-.55 0-1 .45-1 1s.45 1 1 1zm16 0c.55 0 1-.45 1-1s-.45-1-1-1-1 .45-1 1 .45 1 1 1zm-1-9c0 .55.45 1 1 1s1-.45 1-1-.45-1-1-1-1 .45-1 1zm1 5c.55 0 1-.45 1-1s-.45-1-1-1-1 .45-1 1 .45 1 1 1z"})
                                  "TocRounded"))
