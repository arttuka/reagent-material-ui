(ns reagent-material-ui.icons.add-business-two-tone
  "Imports @material-ui/icons/AddBusinessTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def add-business-two-tone (create-svg-icon [(e "path" #js {"d" "M15.36 9H3.64l-.6 3h12.92z", "opacity" ".3"}) (e "path" #js {"d" "M2 4h15v2H2zm13 13h2v-3h1v-2l-1-5H2l-1 5v2h1v6h9v-6h4v3zm-6 1H4v-4h5v4zm-5.96-6 .6-3h11.72l.6 3H3.04z"}) (e "path" #js {"d" "M20 18v-3h-2v3h-3v2h3v3h2v-3h3v-2z"})]
                                            "AddBusinessTwoTone"))
