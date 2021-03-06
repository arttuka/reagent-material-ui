(ns reagent-material-ui.icons.money-rounded
  "Imports @material-ui/icons/MoneyRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def money-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M16 10h1v4h-1zm-6 0h1v4h-1z"}) (e "path" #js {"d" "M20 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zM7 15c0 .55-.45 1-1 1s-1-.45-1-1V9c0-.55.45-1 1-1s1 .45 1 1v6zm6 0c0 .55-.45 1-1 1H9c-.55 0-1-.45-1-1V9c0-.55.45-1 1-1h3c.55 0 1 .45 1 1v6zm6 0c0 .55-.45 1-1 1h-3c-.55 0-1-.45-1-1V9c0-.55.45-1 1-1h3c.55 0 1 .45 1 1v6z"}))
                                    "MoneyRounded"))
