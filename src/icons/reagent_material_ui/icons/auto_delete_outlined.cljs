(ns reagent-material-ui.icons.auto-delete-outlined
  "Imports @material-ui/icons/AutoDeleteOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def auto-delete-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15 2h-3.5l-1-1h-5l-1 1H1v2h14zM16 9c-.7 0-1.37.1-2 .29V5H2v12c0 1.1.9 2 2 2h5.68c1.12 2.36 3.53 4 6.32 4 3.87 0 7-3.13 7-7s-3.13-7-7-7zm-7 7c0 .34.03.67.08 1H4V7h8v3.26c-1.81 1.27-3 3.36-3 5.74zm7 5c-2.76 0-5-2.24-5-5s2.24-5 5-5 5 2.24 5 5-2.24 5-5 5z"}) (e "path" #js {"d" "M16.5 12H15v5l3.6 2.1.8-1.2-2.9-1.7z"}))
                                           "AutoDeleteOutlined"))
