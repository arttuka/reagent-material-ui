(ns reagent-material-ui.icons.skip-next-outlined
  "Imports @material-ui/icons/SkipNextOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def skip-next-outlined (create-svg-icon (e "path" #js {"d" "M6 18l8.5-6L6 6v12zm2-8.14L11.03 12 8 14.14V9.86zM16 6h2v12h-2z"})
                                         "SkipNextOutlined"))
