public class \u51fa\u12cb\u7330\u74b1\u6c52.\u3776\u527a\ua61f\u8df4\u2dcc {
    public void \u3776\u527a\ua61f\u8df4\u2dcc(java.lang.StringBuffer p0, java.io.InputStream p1, \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u71ae\u527a\u2dcc\u983f\u67e9 p2) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:Thread(Thread::<init>, this:\u3776\u527a\ua61f\u8df4\u2dcc)
            putfield:Pattern(\u3776\u527a\ua61f\u8df4\u2dcc::\u7330\u12b2\u516c\u960f\u9255, this:\u3776\u527a\ua61f\u8df4\u2dcc, invokestatic:Pattern(Pattern::compile, loadelement:String(getstatic:String[](\u3776\u527a\ua61f\u8df4\u2dcc::\u76bc\ub8be\u6b0d\ucb79\u71ae), and:int(ldc:int(-23915), ldc:int(23880)))))
            putfield:InputStream(\u3776\u527a\ua61f\u8df4\u2dcc::\u9255\u446c\u0a06\ua61f\u74b1, this:\u3776\u527a\ua61f\u8df4\u2dcc, p1:InputStream)
            putfield:StringBuffer(\u3776\u527a\ua61f\u8df4\u2dcc::\uff55\u5654\u12cb\u8389\uafe7, this:\u3776\u527a\ua61f\u8df4\u2dcc, p0:StringBuffer)
            putfield:\u71ae\u527a\u2dcc\u983f\u67e9(\u3776\u527a\ua61f\u8df4\u2dcc::\ufe34\u8709\u99f7\u3dd3\u6d69, this:\u3776\u527a\ua61f\u8df4\u2dcc, p2:\u71ae\u527a\u2dcc\u983f\u67e9)
            invokevirtual:void(Thread::start, this:\u3776\u527a\ua61f\u8df4\u2dcc[expected:Thread])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void run() {
        var_1_5F : int
        var_1_71 : int
        var_3_6C : StringBuilder
        var_4_7A : int
        var_1_2A9 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_5F = and:int(ldc:int(97092781), ldc:int(1876651447))
            
            try {
                var_1_71 = and:int(var_1_5F:int, ldc:int(1666031614))
                var_3_6C = initobject:StringBuilder(StringBuilder::<init>)
                
                loop {
                    Label_0109:
                    var_1_71 = and:int(var_1_71:int, ldc:int(1440694439))
                    
                    if (cmpeq:boolean(var_4_7A = invokevirtual:int(InputStream::read, getfield:InputStream(\u3776\u527a\ua61f\u8df4\u2dcc::\u9255\u446c\u0a06\ua61f\u74b1, this:\u3776\u527a\ua61f\u8df4\u2dcc)), ldc:int(-1))) {
                        looporswitchbreak()
                    }
                    
                    loop {
                        if (cmpne:boolean(and:int(var_1_71:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0611)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_71:int, ldc:int(262144)), ldc:int(0))) {
                            var_1_71 = and:int(var_1_71:int, ldc:int(996486320))
                            goto(Label_0524)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_1_71 = and:int(var_1_71:int, ldc:int(-1686968582))
                            goto(Label_0445)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(65536)), ldc:int(0))) {
                            var_1_71 = and:int(var_1_71:int, ldc:int(-472255463))
                            goto(Label_0359)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0281)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(2097152)), ldc:int(0))) {
                            var_1_71 = and:int(var_1_71:int, ldc:int(-1358049617))
                        }
                        
                        Label_0199:
                        
                        if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(128)), ldc:int(0))) {
                            var_1_71 = and:int(var_1_71:int, ldc:int(1641657089))
                            goto(Label_0611)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0524)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_71:int, ldc:int(256)), ldc:int(0))) {
                            var_1_71 = and:int(var_1_71:int, ldc:int(1876961508))
                            goto(Label_0445)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(32)), ldc:int(0))) {
                            var_1_71 = and:int(var_1_71:int, ldc:int(-1882653724))
                            goto(Label_0359)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(131072)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(4)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_1_71 = and:int(var_1_71:int, ldc:int(2109585070))
                            invokevirtual:StringBuffer(StringBuffer::append, getfield:StringBuffer(\u3776\u527a\ua61f\u8df4\u2dcc::\uff55\u5654\u12cb\u8389\uafe7, this:\u3776\u527a\ua61f\u8df4\u2dcc), i2c:char(var_4_7A:int))
                        }
                        
                        Label_0281:
                        
                        if (cmpne:boolean(and:int(var_1_71:int, ldc:int(2)), ldc:int(0))) {
                            var_1_71 = and:int(var_1_71:int, ldc:int(-481276360))
                            goto(Label_0611)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0524)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_71:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0445)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(128)), ldc:int(0))) {
                            var_1_71 = and:int(var_1_71:int, ldc:int(-108818872))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(32)), ldc:int(0))) {
                                var_1_71 = and:int(var_1_71:int, ldc:int(-1815336253))
                                goto(Label_0199)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(16777216)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_1_71 = and:int(var_1_71:int, ldc:int(399471351))
                            
                            if (cmpne:boolean(var_4_7A:int, ldc:int(13))) {
                                looporswitchbreak()
                            }
                        }
                        
                        Label_0359:
                        
                        if (cmpne:boolean(and:int(var_1_71:int, ldc:int(131072)), ldc:int(0))) {
                            var_1_71 = and:int(var_1_71:int, ldc:int(1988878734))
                            goto(Label_0611)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0524)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_71:int, ldc:int(524288)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_1_71:int, ldc:int(256)), ldc:int(0))) {
                                var_1_71 = and:int(var_1_71:int, ldc:int(1836195867))
                                goto(Label_0281)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_71:int, ldc:int(256)), ldc:int(0))) {
                                var_1_71 = and:int(var_1_71:int, ldc:int(1466907606))
                                goto(Label_0199)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_71:int, ldc:int(256)), ldc:int(0))) {
                                var_1_71 = and:int(var_1_71:int, ldc:int(1253748745))
                                loopcontinue()
                            }
                            
                            var_1_71 = and:int(var_1_71:int, ldc:int(1507658175))
                            
                            if (cmpeq:boolean(getfield:\u71ae\u527a\u2dcc\u983f\u67e9(\u3776\u527a\ua61f\u8df4\u2dcc::\ufe34\u8709\u99f7\u3dd3\u6d69, this:\u3776\u527a\ua61f\u8df4\u2dcc), aconstnull:\u71ae\u527a\u2dcc\u983f\u67e9())) {
                                looporswitchbreak()
                            }
                        }
                        
                        Label_0445:
                        
                        if (cmpne:boolean(and:int(var_1_71:int, ldc:int(2048)), ldc:int(0))) {
                            var_1_71 = and:int(var_1_71:int, ldc:int(-1925815293))
                            goto(Label_0611)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(262144)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(4)), ldc:int(0))) {
                                var_1_71 = and:int(var_1_71:int, ldc:int(-1149840744))
                                goto(Label_0359)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_71:int, ldc:int(2097152)), ldc:int(0))) {
                                var_1_71 = and:int(var_1_71:int, ldc:int(2032699988))
                                goto(Label_0281)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(524288)), ldc:int(0))) {
                                var_1_71 = and:int(var_1_71:int, ldc:int(1573958372))
                                goto(Label_0199)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_71:int, ldc:int(512)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_1_71 = and:int(var_1_71:int, ldc:int(-641787410))
                        }
                        
                        Label_0524:
                        
                        if (cmpne:boolean(and:int(var_1_71:int, ldc:int(256)), ldc:int(0))) {
                            var_1_71 = and:int(var_1_71:int, ldc:int(-127044373))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_1_71:int, ldc:int(256)), ldc:int(0))) {
                                var_1_71 = and:int(var_1_71:int, ldc:int(-2042160871))
                                goto(Label_0445)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(524288)), ldc:int(0))) {
                                goto(Label_0359)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(65536)), ldc:int(0))) {
                                goto(Label_0281)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_71:int, ldc:int(262144)), ldc:int(0))) {
                                var_1_71 = and:int(var_1_71:int, ldc:int(364032849))
                                goto(Label_0199)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_71:int, ldc:int(2048)), ldc:int(0))) {
                                var_1_71 = and:int(var_1_71:int, ldc:int(1567162212))
                                loopcontinue()
                            }
                            
                            var_1_71 = and:int(var_1_71:int, ldc:int(937009391))
                            invokespecial:void(\u3776\u527a\ua61f\u8df4\u2dcc::\u6c56\u40a9\u9937\ud12e\ube23\u5bc4, this:\u3776\u527a\ua61f\u8df4\u2dcc, invokevirtual:String(StringBuilder::toString, var_3_6C:StringBuilder))
                        }
                        
                        Label_0611:
                        
                        if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(32)), ldc:int(0))) {
                            var_1_71 = and:int(var_1_71:int, ldc:int(-167495560))
                            goto(Label_0524)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_71:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0445)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(128)), ldc:int(0))) {
                            var_1_71 = and:int(var_1_71:int, ldc:int(-1742214407))
                            goto(Label_0359)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_71:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0281)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0199)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(2097152)), ldc:int(0))) {
                            var_1_2A9 = and:int(var_1_71:int, ldc:int(2038258622))
                            invokevirtual:void(StringBuilder::setLength, var_3_6C:StringBuilder, and:int(ldc:int(-16785), ldc:int(16784)))
                            var_1_71 = and:int(var_1_2A9:int, ldc:int(1640592302))
                            loopcontinue(Label_0109)
                        }
                        
                        var_1_71 = and:int(var_1_71:int, ldc:int(-835087202))
                    }
                    
                    invokevirtual:StringBuilder(StringBuilder::append, var_3_6C:StringBuilder, i2c:char(var_4_7A:int))
                }
            }
            catch (java.io.IOException stack_2D7_0) {
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u6c56\u40a9\u9937\ud12e\ube23\u5bc4(java.lang.String p0) {
        var_4_68 : Matcher
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_4_68 = invokevirtual:Matcher(Pattern::matcher, getfield:Pattern(\u3776\u527a\ua61f\u8df4\u2dcc::\u7330\u12b2\u516c\u960f\u9255, this:\u3776\u527a\ua61f\u8df4\u2dcc), p0:String[expected:CharSequence])
            
            if (invokevirtual:boolean(Matcher::matches, var_4_68:Matcher)) {
                invokeinterface:void(\u71ae\u527a\u2dcc\u983f\u67e9::\u3d4b\u600f\u8df4\uae5d\u3bd6\u6d69, getfield:\u71ae\u527a\u2dcc\u983f\u67e9(\u3776\u527a\ua61f\u8df4\u2dcc::\ufe34\u8709\u99f7\u3dd3\u6d69, this:\u3776\u527a\ua61f\u8df4\u2dcc), invokestatic:float(Float::parseFloat, invokevirtual:String(Matcher::group, var_4_68:Matcher, loadelement:String(getstatic:String[](\u3776\u527a\ua61f\u8df4\u2dcc::\u76bc\ub8be\u6b0d\ucb79\u71ae), and:int(ldc:int(6577), ldc:int(1093))))), i2l:long(invokespecial:int(\u3776\u527a\ua61f\u8df4\u2dcc::\ubded\uceb8\u64f2\u983f\u8c8a\u3e2a, this:\u3776\u527a\ua61f\u8df4\u2dcc, invokevirtual:String(Matcher::group, var_4_68:Matcher, loadelement:String(getstatic:String[](\u3776\u527a\ua61f\u8df4\u2dcc::\u76bc\ub8be\u6b0d\ucb79\u71ae), xor:int(ldc:int(-31231), ldc:int(-31229)))), invokevirtual:String(Matcher::group, var_4_68:Matcher, loadelement:String(getstatic:String[](\u3776\u527a\ua61f\u8df4\u2dcc::\u76bc\ub8be\u6b0d\ucb79\u71ae), and:int(ldc:int(5139), ldc:int(16427)))))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private int \ubded\uceb8\u64f2\u983f\u8c8a\u3e2a(java.lang.String p0, java.lang.String p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(add:int(mul:int(invokestatic:int(Integer::parseInt, p0:String), ldc:int(60)), invokestatic:int(Integer::parseInt, p1:String)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_8F_0 : byte[] [generated]
        stack_91_0 : byte[] [generated]
        stack_AB_0 : byte[] [generated]
        stack_AD_0 : byte[] [generated]
        stack_CE_0 : byte[] [generated]
        stack_1CD_0 : byte[] [generated]
        stack_246_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_167 : byte[]
        var_4_168 : int
        expr_91 : int [generated]
        var_5_1B7 : int
        var_3_1BC : byte[]
        var_4_1BD : int
        var_0_1C3 : int
        expr_1CD : byte [generated]
        stack_211_2 : byte [generated]
        stack_1F0_0 : byte [generated]
        expr_AD : int [generated]
        var_3_234 : byte[]
        var_4_235 : int
        expr_246 : byte [generated]
        var_3_DA : String
        stack_15E_0 : String[] [generated]
        expr_EC : String[] [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_0_5F = and:int(ldc:int(-631059138), ldc:int(-1099264755))
            expr_65 = var_2_69 = stack_8F_0 = stack_91_0 = stack_AB_0 = stack_AD_0 = stack_CE_0 = stack_1CD_0 = stack_246_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("A/b1Q09JzA8AhwbLyvSNsL96bwBKjEGFjJF6A0aPEAOFEQesOI2DucI572UzLjmBVY/N0wXWfsoJ8P45s634AEpDTVNGgq50NjD9gcPPQ8wAwwN0zAB0AAwA+XiExTmE"))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_167 = newarray:byte[](byte.class, expr_6D:int)
                var_4_168 = expr_6D:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1635782675))
                    var_4_168 = add:int(var_4_168:int, ldc:int(-1))
                    storeelement:byte(var_3_167:byte[], var_4_168:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_168:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_168:int, xor:int(ldc:int(1088), ldc:int(1089)))), ldc:int(2)), and:int(ldc:int(25279), ldc:int(3455)))))
                    
                    if (cmpne:boolean(var_4_168:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_91_0 = stack_8F_0 = stack_AB_0 = stack_AD_0 = stack_CE_0 = stack_1CD_0 = stack_246_0 = var_3_167:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2048)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1000757685))
                    goto(Label_0178)
                }
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-537665539))
                    expr_91 = arraylength:int(stack_91_0:byte[])
                    
                    if (cmpne:boolean(expr_91:int, ldc:int(0))) {
                        var_5_1B7 = expr_91:int
                        var_3_1BC = newarray:byte[](byte.class, expr_91:int)
                        var_4_1BD = expr_91:int
                        
                        loop {
                            var_0_1C3 = and:int(var_0_5F:int, ldc:int(-1100296756))
                            var_4_1BD = add:int(var_4_1BD:int, ldc:int(-1))
                            expr_1CD = stack_211_2 = loadelement(stack_1CD_0, var_4_1BD)
                            
                            if (cmplt:boolean(add:int(add:int(var_4_1BD:int, ldc:int(6)), neg:int(var_5_1B7:int)), ldc:int(0))) {
                                stack_211_2 = stack_1F0_0 = add:byte(expr_1CD:byte, loadelement:byte(var_3_1BC:byte[], add:int(var_4_1BD:int, ldc:int(6))))
                                goto(Label_0512)
                            }
                            
                            Label_0474:
                            
                            if (cmpeq:boolean(and:int(var_0_1C3:int, ldc:int(1024)), ldc:int(0))) {
                                var_0_1C3 = and:int(var_0_1C3:int, ldc:int(-2052306523))
                            }
                            else {
                                var_0_1C3 = and:int(var_0_1C3:int, ldc:int(-1074803281))
                                stack_211_2 = stack_1F0_0 = add:byte(expr_1CD:byte, ldc:byte(6))
                            }
                            
                            Label_0512:
                            
                            if (cmpne:boolean(and:int(var_0_1C3:int, ldc:int(1048576)), ldc:int(0))) {
                                goto(Label_0474)
                            }
                            
                            var_0_5F = and:int(var_0_1C3:int, ldc:int(-1695359169))
                            storeelement:byte(var_3_1BC:byte[], var_4_1BD:int, stack_211_2:byte)
                            
                            if (cmpne:boolean(var_4_1BD:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_91_0 = stack_8F_0 = stack_AB_0 = stack_AD_0 = stack_CE_0 = stack_1CD_0 = stack_246_0 = var_3_1BC:byte[]
                    }
                }
                
                Label_0150:
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(67108864)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(512)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1611931778))
                    expr_AD = arraylength:int(stack_AD_0:byte[])
                    
                    if (cmpne:boolean(expr_AD:int, ldc:int(0))) {
                        var_3_234 = newarray:byte[](byte.class, expr_AD:int)
                        var_4_235 = expr_AD:int
                        
                        loop {
                            var_0_5F = and:int(var_0_5F:int, ldc:int(-25977537))
                            var_4_235 = add:int(var_4_235:int, ldc:int(-1))
                            expr_246 = loadelement:byte(stack_246_0:byte[], var_4_235:int)
                            storeelement:byte(var_3_234:byte[], var_4_235:int, add:int(xor:int(or:int(and:int(shl:int(expr_246:byte, xor:int(ldc:int(11779), ldc:int(11783))), ldc:int(-16)), and:int(shr:int(expr_246:byte[expected:int], xor:int(ldc:int(-32635), ldc:int(-32639))), ldc:int(15))), ldc:int(27)), ldc:int(6)))
                            
                            if (cmpne:boolean(var_4_235:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_91_0 = stack_8F_0 = stack_AB_0 = stack_AD_0 = stack_CE_0 = stack_1CD_0 = stack_246_0 = var_3_234:byte[]
                    }
                }
                
                Label_0178:
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(33554432)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-266410884))
                    goto(Label_0150)
                }
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(33554432)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_DA = initobject:String(String::<init>, stack_CE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_15E_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2196), ldc:int(71)))
            expr_EC = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2260), ldc:int(260)))
            storeelement:String(expr_EC:String[], and:int(ldc:int(20259), ldc:int(-28600)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, and:int(ldc:int(5408), ldc:int(-5409)), and:int(ldc:int(75), ldc:int(17882))))
            storeelement:String(expr_EC:String[], xor:int(ldc:int(-32702), ldc:int(-32704)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, xor:int(ldc:int(16950), ldc:int(17020)), xor:int(ldc:int(20536), ldc:int(20585))))
            storeelement:String(expr_EC:String[], xor:int(ldc:int(166), ldc:int(167)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, xor:int(ldc:int(614), ldc:int(567)), and:int(ldc:int(634), ldc:int(13657))))
            storeelement:String(expr_EC:String[], xor:int(ldc:int(5127), ldc:int(5124)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, xor:int(ldc:int(1109), ldc:int(1037)), and:int(ldc:int(9311), ldc:int(991))))
            putstatic:String[](\u3776\u527a\ua61f\u8df4\u2dcc::\u76bc\ub8be\u6b0d\ucb79\u71ae, expr_EC:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ua3b4\uc2e8\u6435\u3e2a\ua6bd\ucb79(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_68E : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_699 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_68E = and:int(ldc:int(1740470015), ldc:int(1738503391))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3776\u527a\ua61f\u8df4\u2dcc[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_68E = and:int(var_3_68E:int, ldc:int(-402704932))
            var_5_80 = and:int(ldc:int(-4669), ldc:int(4668))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(18627), ldc:int(-18640)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_68E:int, ldc:int(-425740834))
                    var_9_C7 = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_87:int, xor:int(ldc:int(768), ldc:int(769)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, xor:int(ldc:int(390), ldc:int(391)))), var_7_96:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_68E = and:int(var_3_D9:int, ldc:int(-155355171))
                    var_14_114 = var_7_96:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(12421), ldc:int(1041)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_87:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1733467908))
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1383)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-522675474))
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1247374887))
                        goto(Label_0948)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(123219732))
                        goto(Label_0809)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1123061117))
                        goto(Label_0682)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1862221054))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0564)
                            }
                            
                            goto(Label_0809)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1383)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-637914799))
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1551792082))
                        goto(Label_1111)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1091472065))
                        goto(Label_0948)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0809)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0682)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(1860024319))
                            var_11_EA = and:int(ldc:int(-25578), ldc:int(9000))
                            goto(Label_1524)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0564:
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(4886179))
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1383)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1215408703))
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0948)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(370630580))
                        goto(Label_0809)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(1241983604))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1728002015))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0809)
                        }
                    }
                    
                    Label_0682:
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1383)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-89965863))
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0948)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1114115732))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-569482265))
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-1732184759))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-425771524))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0809:
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1441049811))
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1383)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-375464295))
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1626700271))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-422296078))
                            goto(Label_0682)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-2119162650))
                            goto(Label_0564)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(526750983))
                            loopcontinue()
                        }
                        
                        var_3_68E = and:int(var_3_68E:int, ldc:int(2124379645))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_EA = xor:int(ldc:int(16388), ldc:int(16389))
                                goto(Label_1111)
                            }
                        }
                    }
                    
                    Label_0948:
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1772825544))
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-19760402))
                        goto(Label_1383)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(880503669))
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(128)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-223527129))
                            goto(Label_0809)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0682)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(268916188))
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68E = and:int(var_3_68E:int, ldc:int(2128559614))
                        var_11_EA = and:int(ldc:int(24064), ldc:int(-24066))
                    }
                    
                    Label_1111:
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1383)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(550758524))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(1963275472))
                            goto(Label_0948)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-821252402))
                            goto(Label_0809)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(266421136))
                            goto(Label_0682)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(4)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-909854400))
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1859991261))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1383)
                            }
                        }
                    }
                    
                    Label_1241:
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(942584184))
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1523996868))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_1111)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(387903398))
                            goto(Label_0948)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(661740530))
                            goto(Label_0809)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0682)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-1736102276))
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-157420067))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_80:int, var_16_118:int)
                            goto(Label_1524)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1383:
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1911465798))
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(373767415))
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-135282307))
                        goto(Label_0948)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0809)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1211624089))
                        goto(Label_0682)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-576553565))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_68E = and:int(var_3_68E:int, ldc:int(-406981124))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1524:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_699 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1535:
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-605230838))
                        goto(Label_1383)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-255085842))
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(2139257860))
                        goto(Label_0948)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1440341707))
                        goto(Label_0809)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(508722680))
                        goto(Label_0682)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1829806833))
                        goto(Label_0564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-389937124))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-419613219))
                        var_17_699 = add:int(var_16_118:int, xor:int(ldc:int(24), ldc:int(25)))
                        looporswitchbreak()
                    }
                    
                    var_3_68E = and:int(var_3_68E:int, ldc:int(-2059065656))
                }
                
                var_3_68E = and:int(var_3_68E:int, ldc:int(1994374878))
                
                if (cmple:boolean(var_5_80 = var_17_699:int, sub:int(var_6_87:int, xor:int(ldc:int(16832), ldc:int(16833))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_68E = and:int(var_3_68E:int, ldc:int(-460958193))
            goto(Label_0108)
        }
    }
}
