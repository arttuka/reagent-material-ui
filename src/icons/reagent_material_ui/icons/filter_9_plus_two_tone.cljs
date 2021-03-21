(ns reagent-material-ui.icons.filter-9-plus-two-tone
  "Imports @material-ui/icons/Filter9PlusTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def filter-9-plus-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M7 17h14v-6h-2v2h-2v-2h-2V9h2V7h2v2h2V3H7v14zm2-5h3v-1h-1c-1.1 0-2-.89-2-2V8c0-1.11.9-2 2-2h1c1.1 0 2 .89 2 2v4c0 1.11-.9 2-2 2H9v-2z", "opacity" ".3"}) (e "path" #js {"d" "M19 21H3V5H1v16c0 1.1.9 2 2 2h16v-2z"}) (e "path" #js {"d" "M11 8h1v1h-1z", "opacity" ".3"}) (e "path" #js {"d" "M12 6h-1c-1.1 0-2 .89-2 2v1c0 1.11.9 2 2 2h1v1H9v2h3c1.1 0 2-.89 2-2V8c0-1.11-.9-2-2-2zm0 3h-1V8h1v1zm9-8H7c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V3c0-1.1-.9-2-2-2zm0 8h-2V7h-2v2h-2v2h2v2h2v-2h2v6H7V3h14v6z"}))
                                             "Filter9PlusTwoTone"))
