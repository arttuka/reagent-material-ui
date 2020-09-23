(ns reagent-material-ui.icons.add-business-outlined
  "Imports @material-ui/icons/AddBusinessOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def add-business-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M2 4h15v2H2zM15 17h2v-3h1v-2l-1-5H2l-1 5v2h1v6h9v-6h4v3zm-6 1H4v-4h5v4zm-5.96-6l.6-3h11.72l.6 3H3.04z"}) (e "path" #js {"d" "M23 18h-3v-3h-2v3h-3v2h3v3h2v-3h3z"}))
                                            "AddBusinessOutlined"))
