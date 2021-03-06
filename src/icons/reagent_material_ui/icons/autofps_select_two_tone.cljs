(ns reagent-material-ui.icons.autofps-select-two-tone
  "Imports @material-ui/icons/AutofpsSelectTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def autofps-select-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12.03 6.3h-.06l-1.02 2.89h2.1zM3 17h2v5H3z"}) (e "path" #js {"d" "M12 15c3.31 0 6-2.69 6-6s-2.69-6-6-6-6 2.69-6 6 2.69 6 6 6zm-.63-10h1.25l2.63 7h-1.21l-.63-1.79h-2.83L9.96 12H8.74l2.63-7zM7 17h2v5H7zm4 0h2v5h-2zm4 0h6v5h-6z"}))
                                              "AutofpsSelectTwoTone"))
