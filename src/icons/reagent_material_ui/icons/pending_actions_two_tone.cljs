(ns reagent-material-ui.icons.pending-actions-two-tone
  "Imports @material-ui/icons/PendingActionsTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def pending-actions-two-tone (create-svg-icon [(e "path" #js {"d" "M18.65 19.35 16.5 17.2V14h1v2.79l1.85 1.85-.7.71zM17 10c.34 0 .67.03 1 .08V5h-2v3H8V5H6v15h4.68c-.43-.91-.68-1.92-.68-3 0-3.87 3.13-7 7-7zm-5-5c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1z", "opacity" ".3"}) (e "path" #js {"d" "M17 12c-2.76 0-5 2.24-5 5s2.24 5 5 5 5-2.24 5-5-2.24-5-5-5zm1.65 7.35L16.5 17.2V14h1v2.79l1.85 1.85-.7.71zM18 3h-3.18C14.4 1.84 13.3 1 12 1s-2.4.84-2.82 2H6c-1.1 0-2 .9-2 2v15c0 1.1.9 2 2 2h6.11c-.59-.57-1.07-1.25-1.42-2H6V5h2v3h8V5h2v5.08c.71.1 1.38.31 2 .6V5c0-1.1-.9-2-2-2zm-6 2c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1z"})]
                                               "PendingActionsTwoTone"))
