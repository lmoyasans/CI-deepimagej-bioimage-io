(ns test-setup
  (:require [clojure.test :refer :all]
            [collection :refer [COLLECTION-ROOT]]
            [babashka.fs :as fs]))

(def test-rdf-path "The rdf of the first folder of the collection" (atom nil))

(def rdf-paths "Paths to different rdfs for testing"
  {:an-rdf-path (atom nil) :tf-rdf-path (atom nil) :pt-rdf-path (atom nil)})

(defn load-test-data
  [test-fn]
  (reset! test-rdf-path
          (fs/path COLLECTION-ROOT "10.5281" "zenodo.6334881" "6346477" "rdf.yaml"))
  (test-fn))