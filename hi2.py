import re
import nltk
from nltk.corpus import stopwords as nltk_stopwords
from nltk.tokenize import word_tokenize
from nltk.stem import SnowballStemmer
from urllib.parse import unquote, quote

# Initialize the Porter Stemmer from SnowballStemmer
stemmer = SnowballStemmer("english")

def preprocess_and_encode(text, stopwords=True):
    """
    Preprocesses text by tokenizing, removing stopwords and stemming, then encodes the processed text.
    :param text: The text string to be processed.
    :param stopwords: A boolean flag for whether to perform stopword removal or not (default is True).
    :return: The encoded and processed text as a list of tokenized words.
    """

    # Preprocess the text
    if stopwords:
        words = preprocess(text)
    else:
        words = word_tokenize(text)

    # Stem the words
    words = [stemmer.stem(w) for w in words]

    return words

def process_and_output(input_text, encoding='latin-1', stopwords=True):
    """
    Processes an input text string by preprocessing and encoding it, then outputs the processed result.
    :param input_text: The text string to be processed.
    :param encoding: The encoding for the input text (default is 'latin-1').
    :param stopwords: A boolean flag for whether to perform stopword removal or not (default is True).
    """

    # Preprocess and encode the text
    words = preprocess_and_encode(input_text, stopwords)

    # Encode the processed text as a string
    encoded_text = encode_decode(' '.join([f'{i}:{w}' for i, w in enumerate(words)]), encoding)

    print("Original Text: ", input_text)
    print("Encoded Text: ", encoded_text)

if __name__ == "__main__":
    input_text = "Text with %unicode% and %stopwords% like the, a, an, and."

    process_and_output(input_text) 