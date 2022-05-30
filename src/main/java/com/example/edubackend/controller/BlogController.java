package com.example.edubackend.controller;

import com.example.edubackend.payload.BlogArticle;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(value = "http://localhost:3000")
@RequestMapping(path="/blog")
@RestController
public class BlogController {

    @GetMapping("bloglist")
    public String blogList(){
        return "bloglist";
    }

    @GetMapping("article/{articlename}")
    public BlogArticle blogArticle(@PathVariable(value = "articlename") String articlename){
        return new BlogArticle( "What is a blog post?" ,
                "A blog post is a single piece of content published on a blog, a shortened form of the now-archaic term weblog, which is an online platform for publishing written content. A blog can be a section of a website or a standalone website of its own. The blog you’re currently reading is an example of the former, while The Pioneer Woman is an example of the latter. Both are composed of blog posts, pieces of content that each cover a single topic and may (but don’t have to!) include images and videos alongside the written content. \n" +
                "\n" +
                "Written content is a key component of a blog post. A YouTube channel isn’t a blog because it’s purely video—it can be considered a vlog, short for video log. Similarly, a feed of purely still images, like an Instagram account, isn’t a blog. \n" +
                "\n" +
                "In the earlier days of social media, when platforms like MySpace and Live Journal dominated the scene, blogging and social media were much more entwined than they are today. Now, they’re largely separate, though many bloggers promote and cross-post their work on their social media accounts to drive traffic to their blogs and promote their personal brand. \n" +
                "\n" +
                "Types of blog posts\n" +
                "Blog posts can be standalone pieces or parts of a longer series. They also come in a variety of formats: \n" +
                "\n" +
                "How-to\n" +
                "In a how-to blog post, the blogger explains the steps the reader needs to take to complete a task. Recipe blog posts are a popular example of a how-to blog post. \n" +
                "\n" +
                "List-based\n" +
                "Also known as a “listicle,” a portmanteau of list and article, a list-based blog post is one that’s organized as a list of related entries. This could be a list of products, historical events, quotes, images, or unusual and intriguing facts, the kind of listicle Cracked.com made famous. You’ll find list-based posts on lots of blogs, like BuzzFeed, Bored Panda, and right here on the Grammarly blog. \n" +
                "\n" +
                "News article\n" +
                "A news article blog post links to a trending news article and provides the blogger’s thoughts on that news article. It isn’t just a repost of the news article; it includes insights that build upon, speculate about, agree, or disagree with the information covered in the news article. \n" +
                "\n" +
                "Interview\n" +
                "In this kind of post, the blogger introduces a person they’ve interviewed and provides some background information about the interviewee and their work. Following this is a transcript of the interview, sometimes interspersed with additional information written by the blogger. You can find interviews on many different blogs, such as Rotten Tomatoes’ blog. \n" +
                "\n" +
                "Review\n" +
                "In a review post, the blogger reviews a movie, video game, TV show, book, product . . . anything, really. What’s Good at Trader Joes? is a well-known example of a blog that focuses on product review posts. A review post can focus on one product or piece of media or it can be structured like a list-based post. You can find examples of the latter on 99designs, where they often review design software and website platforms. \n" +
                "\n" +
                "Personal\n" +
                "A personal blog post, like a personal essay, is where the author discusses their personal experiences, thoughts, and/or opinions. Usually, you’ll find these kinds of posts on personal blogs rather than corporate or professional blogs. However, a blogger who usually publishes other kinds of blog posts might publish personal blog posts from time to time to build a more personal connection with readers. \n" +
                "\n" +
                "Explainer\n" +
                "An explainer blog post is similar to a how-to blog post in that it provides a thorough, objective explanation of its topic. The difference is that this kind of blog post isn’t necessarily presented in a linear, step-by-step format and doesn’t necessarily explain how to complete a task. \n" +
                "\n" +
                "This type of blog post might explain the social and economic trends that led to a specific historical event or the basics of a given topic. Coinbase’s blog contains lots of explainer posts, such as a piece on how to keep your cryptocurrency secure. \n" +
                "\n" +
                "Sometimes, blogs publish lengthy explainer posts that aim to provide comprehensive overviews of their topics. These blog posts are often labeled “ultimate guide” or something similar. \n" +
                "\n" +
                "Image-based\n" +
                "As the name implies, an image-based blog post is a post that focuses on images. The post could be an infographic or it could be a post consisting of multiple images. No matter which it is, it contains at least some copy to give the reader some context for the images—that’s what makes it a blog post and not an image gallery.  \n" +
                "\n" +
                "How to write a blog post\n" +
                "Ready to start blogging? Follow these steps to write a great post and effectively reach your target audience. \n" +
                "\n" +
                "Set up your blog\n" +
                "Before you can write a blog post, you need to actually have a blog. If you already have a website, find out if you can create a blog on the platform you’re using. Many of the templates available on widely used website platforms like Squarespace and Joomla make it easy for you to start blogging right on your website. \n" +
                "\n" +
                "If you aren’t able to create a blog through your web hosting/design platform—or if you don’t have a website—you’ll need to build your blog from scratch. There are lots of ways to do this, some involving more technical skills than others. You can opt for an out-of-the-box platform like Wix or Squarespace, or you can go with a more DIY option like WordPress. \n" +
                "\n" +
                "Setting up your blog means determining a budget for your blog. You’ll need to pay for the following:\n" +
                "\n" +
                "Hosting\n" +
                "The domain name\n" +
                "Design services (unless you opt to design the blog yourself)\n" +
                "Blog writing and/or editing (unless you plan to do all of this work yourself)\n" +
                "Running a blog can be free, but keep in mind this generally means you can’t use a custom domain name and you’ll probably have ads on your site. For a low-budget personalized blog, expect to spend about a hundred dollars to set everything up and cover a year’s worth of hosting. In some cases, blogs cost thousands of dollars to build and operate—these are usually high-traffic blogs with custom-designed templates requiring a large amount of bandwidth. \n" +
                "\n" +
                "As your blog grows, you can offset costs by selling ad space on your blog. Another strategy some bloggers use to reduce costs is affiliate marketing, which is where you link to an affiliate partner’s online product listings in your content; you receive a cut of the revenue they make through your placement of their link(s). \n" +
                "\n" +
                "Blogging without your own website\n" +
                "Instead of setting up their own blogs, some bloggers opt to publish on large, public platforms instead. One of these platforms is Medium. Another is Tumblr, which hearkens to the early days of social media by combining social and blogging features in one platform. \n" +
                "\n" +
                "If you stick with blogging and make a name for yourself, you can also explore guest blogging on larger, established blogs. Many of these blogs publish mostly, or even only, posts by guest bloggers. And you can get paid for doing it!\n" +
                "\n" +
                "Choose your topic\n" +
                "Once you’ve got your blog up and running, it’s time to choose the topic for your first post. \n" +
                "\n" +
                "What can you easily and passionately write about? If your blog is affiliated with your business, brainstorm ideas for blog posts that provide value to your target audience while promoting your brand. For example, let’s say you run a dog-walking business. Think about the kinds of things your clients would want to read about—the titles they’d click on, read, and ideally share with others. You might come up with a few different topics:\n" +
                "\n" +
                "Choosing a pet-safe ice melt for your sidewalk this winter\n" +
                "How many calories does my dog burn on an average walk?\n" +
                "Are pack walks safe? How many dogs are too many for one handler?\n" +
                "How to get your dog acclimated to a new harness in no time\n" +
                "Ask your clients about the kinds of topics they’d like to read about on your blog. You might be surprised by what they suggest! Another great way to come up with topics to cover on your blog is to take a look at the kind of content others in your industry are publishing. That doesn’t mean you should steal ideas or plagiarize their work; find ways to take inspiration from competitors’ blog posts and cover similar topics from a different angle and in your own unique voice. \n" +
                "\n" +
                "Write an outline\n" +
                "With any writing project, following the writing process enables you to craft a thoughtful, well-developed piece. Blog posts are no exception. After you’ve determined a topic for your first blog post, create an outline. List your working title and the key points you want to hit in your post. These key points will likely become separate sections, each with its own header and subheaders. \n" +
                "\n" +
                "An easy way to write an outline for your blog post is to follow a similar structure to an essay. Your blog post starts with an introduction, which is then followed by body sections and then finally, the conclusion. But unlike an essay, a blog post’s conclusion includes a call to action. (We’ll talk more about that in a bit.) \n" +
                "\n" +
                "Once your outline is complete, it’s time to start writing! There are lots of great, free apps you can use to write a blog post, like Google Docs and WriteRoom.\n" +
                "\n" +
                "Hook your reader and keep them scrolling to the end\n" +
                "In any kind of writing, the hook is one of the most important parts. This sentence or paragraph is the part that grabs the reader’s attention and promises that their curiosity will be satisfied if they keep reading. \n" +
                "\n" +
                "There are lots of ways to hook your readers’ attention, and the ideal way for each blog post depends on the audience and the subject the post is covering. One popular type of hook is to present a startling fact. To go back to our example titles for the dog walker, an effective hook for the post on pet-safe ice melts might be about how toxic many standard ice melts are to pets’ paws. Another effective way to hook readers is to directly address one or more of their pain points. For the example title about acclimating a dog to a new harness, this kind of hook might acknowledge a few things: how frustrating it is to get a dog to let you put a new harness on them; how this wastes precious walking time; and how you could waste money on harnesses your dog refuses to wear. \n" +
                "\n" +
                "Give your readers a solid call to action\n" +
                "A call to action is a short phrase that asks the reader to do something. In a blog post, this might be to leave a comment, make a purchase, subscribe to your newsletter, or simply to read a related post next. Calls to action generally make use of direct-response copywriting principles, like making very specific requests and creating a sense of urgency. Here are a few examples of calls to action:\n" +
                "\n" +
                "Like what you see? Head over to my shop and order your custom print now.\n" +
                "Want to learn more about reading tarot cards like a pro? Check out my post on the major arcana’s astrological associations.\n" +
                "I’d love to hear your thoughts. Leave a comment below and tell me whether you agree or disagree and why.\n" +
                "Don’t forget to edit and proofread!\n" +
                "Read through the draft carefully and take note of any spots where your writing feels awkward, choppy, or even excessively wordy. Editing resources like Grammarly, various writing books, and even your own network of fellow writers can help you become a stronger editor by making you more attuned to issues in your work. \n" +
                "\n" +
                "Enhance your blog post with engaging, relevant images\n" +
                "Why do kids like picture books? Because the illustrations bring the story to life. \n" +
                "\n" +
                "The same thing happens when you include images in your blog posts. Images break up the text and give your readers short breaks as they work through your content. In explainer and how-to blog posts, they can also help readers visualize the points you’re making in your text—and even help them avoid making mistakes by demonstrating what their project should look like as they complete it step by step. \n" +
                "\n" +
                "Use SEO strategies to reach a wider audience\n" +
                "SEO, also known as search engine optimization, is a category of strategies bloggers and other website operators use to increase their websites’ visibility. The better your SEO strategy, the higher your website ranks, or shows up, in search engine results. The goal is to have your blog be the first listing that comes up when people search for specific keywords. \n" +
                "\n" +
                "Keywords are just one component of SEO. Here are other ways to improve your blog’s SEO:\n" +
                "\n" +
                "Organizing your content neatly. This means no walls of text (we’ll get to those in a moment) and clear headers to separate sections within the blog post. \n" +
                "Relevant embedded images with the appropriate keywords in their metadata. Metadata is the data that gives more context to images, like their alt descriptions and file names.\n" +
                "Keeping your blog post to an SEO-friendly length. As of 2021, the ideal blog length for SEO purposes is 1,760-2,400 words. Don’t take this as a requirement, though—generally, posts that clock in at 1,000 words or longer rank well, and even blog posts as short as 300 words can rank well if they utilize other SEO strategies. Your blog post should be as long as it needs to be; don’t artificially lengthen it just for the sake of SEO. That’s because another key component of SEO is . . .\n" +
                "Value. Above all, make sure your blog post actually provides relevant, valuable information for your readers. \n" +
                "Your website platform might include analytics tools you can use to see how well your blog and individual posts are performing. By “performing,” we mean how many people visit your website and how long they spend on the website, both indicators of your content being effective. \n" +
                "\n" +
                "Tips for writing a great blog post\n" +
                "Keep it conversational\n" +
                "A blog post is a relatively informal, often fun piece of writing. Although there are plenty of technical blogs on the web, you’ll notice that even these tend to maintain a fairly conversational tone when explaining niche and complex topics. \n" +
                "\n" +
                "Notice how most blog posts use the second person and speak directly to the reader. You would never do that in a piece of academic or professional writing. Also notice how plenty of blog posts, on topics ranging from how to finish highly technical projects to completely subjective movie character hairstyle rankings, give you a sense of the author’s personality by including short asides, personal opinions, and sometimes even broken grammar rules to mimic speech patterns. \n" +
                "\n" +
                "Keep in mind that breaking grammar rules to achieve specific effects and working your personal voice into your blog post is not the same thing as writing and publishing an unedited post that simply ignores grammar rules. If you’re going to break the rules, you need to do it carefully and with a clear stylistic reason for doing so. For example, you might opt for sentence fragments, rather than whole paragraphs, in certain sections of your blog post because this magnifies your words’ impact. Take a look at this to see what we mean: \n" +
                "\n" +
                "I’d applied to 10 colleges in total. Five of them, I knew I was a shoo-in. Four of them, I thought I had somewhere between an OK and a pretty good shot at getting in. And the last one, my holy grail of higher ed, I was all-but-certain they’d never accept me. \n" +
                "\n" +
                "Then the envelopes started coming in. Thick ones, thin ones, glossy colorful ones, and nondescript white ones that could easily be mistaken for junk mail. \n" +
                "\n" +
                "And then it arrived. \n" +
                "\n" +
                "The letter I’d been waiting for since seventh grade. \n" +
                "\n" +
                "My acceptance letter from my dream university.\n" +
                "\n" +
                "See how this blog post emphasizes key sentences by making them stand-alone paragraphs? That’s one way bloggers make their posts sound and feel like in-person conversations. Also notice how this excerpt includes informal language like “shoo-in” and literary devices like a synecdoche (referring to acceptance and rejection letters as “envelopes.”)\n" +
                "\n" +
                "Research trending keywords\n" +
                "As we mentioned above, using SEO strategies in your blog post will help it reach a wider audience. If you don’t care about reaching a wide audience and just want to write your blog for yourself or to share with close friends and loved ones, don’t worry about this tip.\n" +
                "\n" +
                "But if you do want to reach a wider audience by having your blog post rank higher on search engines, take the time to research relevant keywords for your post. Soovle, keywordtool.io, Google Search Console, and Google Keyword Planner are all useful tools you can use not only to test out how well a specific keyword ranks, but also to find related keywords you can include in your blog post. With these tools, you can also find inspiration for future blog posts through other keywords related to your initial search. \n" +
                "\n" +
                "Cut down walls of text\n" +
                "Nobody wants to read a wall of text, but sometimes they’re necessary in academic pieces like research papers. \n" +
                "\n" +
                "They’re never necessary in blog posts. \n" +
                "\n" +
                "A wall of text is generally defined as a paragraph that takes up several lines. They’re intimidating to readers and when they see them, a lot of people scroll past or even stop reading the blog post completely. \n" +
                "\n" +
                "When you find a wall of text in your writing, break it down into two or more paragraphs. By doing this, you’re improving your blog post’s readability score, which doesn’t just make it more appealing to readers; it increases your SEO ranking. \n" +
                "\n" +
                "Basically, a good blog post is scannable. As you read your first draft, take note of any spots where you feel slowed down or otherwise like you can’t easily scan the information. Those are the spots to break into smaller sections. \n" +
                "\n" +
                "Whatever you write, do it with confidence\n" +
                "Correct grammar and a consistent tone are the keys to not only maintaining reader attention, but also to effectively communicating the points you make in your blog post. After you’ve edited and proofread your post, have Grammarly give it one last look to catch any mistakes or inconsistency in tone so that your blog post reads exactly how you want it to sound.\n" +
                "\n" +
                "This article was originally written by Karen Hertzberg in 2017. It’s been updated to include new information.");
    }


}
